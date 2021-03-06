package de.adorsys.xs2a.adapter.sparda;

import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import de.adorsys.xs2a.adapter.api.exception.Xs2aAdapterException;

import java.text.ParseException;

public class SpardaJwtService {

    public String getPsuId(String jwtToken) {
        try {
            SignedJWT signedJWT = SignedJWT.parse(jwtToken);
            JWTClaimsSet claimsSet = signedJWT.getJWTClaimsSet();
            return claimsSet.getSubject();
        } catch (ParseException e) {
            throw new Xs2aAdapterException("Sparda JWT parsing exception", e);
        }
    }
}
