package de.adorsys.xs2a.adapter.olb;

import de.adorsys.xs2a.adapter.api.*;
import de.adorsys.xs2a.adapter.api.http.HttpClientFactory;
import de.adorsys.xs2a.adapter.api.link.LinksRewriter;
import de.adorsys.xs2a.adapter.api.model.Aspsp;
import de.adorsys.xs2a.adapter.impl.AbstractAdapterServiceProvider;
import de.adorsys.xs2a.adapter.impl.BasePaymentInitiationService;

public class OlbServiceProvider extends AbstractAdapterServiceProvider {

    @Override
    public AccountInformationService getAccountInformationService(Aspsp aspsp,
                                                                  HttpClientFactory httpClientFactory,
                                                                  LinksRewriter linksRewriter) {
        return new OlbAccountInformationService(aspsp,
            httpClientFactory,
            linksRewriter);
    }

    @Override
    public PaymentInitiationService getPaymentInitiationService(Aspsp aspsp,
                                                                HttpClientFactory httpClientFactory,
                                                                LinksRewriter linksRewriter) {
        return new BasePaymentInitiationService(aspsp,
            httpClientFactory.getHttpClient(getAdapterId()),
            linksRewriter,
            httpClientFactory.getHttpClientConfig().getLogSanitizer());
    }

    @Override
    public String getAdapterId() {
        return "olb-adapter";
    }
}
