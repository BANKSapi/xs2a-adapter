package de.adorsys.xs2a.adapter.crealogix;

import de.adorsys.xs2a.adapter.api.model.*;
import de.adorsys.xs2a.adapter.crealogix.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CrealogixMapper {

    PaymentInitiationWithStatusResponse toPaymentInitiationWithStatusResponse(CrealogixPaymentInitiationWithStatusResponse value);
    TransactionsResponse200Json toTransactionsResponse200Json(CrealogixTransactionResponse200Json value);
    OK200TransactionDetails toOK200TransactionDetails(CrealogixOK200TransactionDetails value);
    Transactions toTransactions(CrealogixTransactionDetails value);
    TokenResponse toTokenResponse(CrealogixValidationResponse value);

    @Mapping(target = "transactionDetails", expression = "java(toTransactions(value))")
    TransactionDetailsBody toTransactionDetailsBody(CrealogixTransactionDetails value);

    default String map(RemittanceInformationStructured value) {
        return value == null ? null : value.getReference();
    }
}
