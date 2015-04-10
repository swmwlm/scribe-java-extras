package my.scribe.extras.builder.api;

import org.scribe.builder.api.DefaultApi20;
import org.scribe.model.OAuthConfig;
import org.scribe.utils.OAuthEncoder;

/**
 * QQ OAuth api
 * @author xiegang
 * @since 2015/3/16
 */
public class QqApi extends DefaultApi20 {
    private static final String AUTHORIZE_URL = "https://graph.qq.com/oauth2.0/authorize?response_type=code&client_id=%s&redirect_uri=%s";

    @Override
    public String getAccessTokenEndpoint() {
        return "https://graph.qq.com/oauth2.0/token?grant_type=authorization_code";
    }

    @Override
    public String getAuthorizationUrl(OAuthConfig config) {
        return String.format(AUTHORIZE_URL, config.getApiKey(), OAuthEncoder.encode(config.getCallback()));
    }
}
