package HTTP;

import java.net.CookieStore;

public class CookieUtils {
    public static CookieStore findCookie(CookieStore[] cookies, String name) {

        if (cookies == null) {
            return null;
        } else {
            for (CookieStore cookie : cookies) {
                if (name.equals(cookie.getCookies())) {
                    return cookie;

                }
            }
            return null;
        }
    }
}


