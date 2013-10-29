/*
 *  License

 *
 *  This file is part of The SeleniumFlex-API.
 *
 *  The SeleniumFlex-API is free software: you can redistribute it and/or
 *  modify it  under  the  terms  of  the  GNU  General Public License as 
 *  published  by  the  Free  Software Foundation,  either  version  3 of 
 *  the License, or any later version.
 *
 *  The SeleniumFlex-API is distributed in the hope that it will be useful,
 *  but  WITHOUT  ANY  WARRANTY;  without  even the  implied  warranty  of
 *  MERCHANTABILITY   or   FITNESS   FOR  A  PARTICULAR  PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with The SeleniumFlex-API.
 *  If not, see http://www.gnu.org/licenses/
 *
 */
 
 /*   Contributed by Black Pepper Software Ltd.  */
 
 
package org.jspringbot.keyword.selenium.flex.call;

import org.jspringbot.keyword.selenium.flex.FlexSelenium;

public class FlashFieldHasErrorMessageCall implements FlashCall {

    private String objectId;
    private FlexSelenium flashApp;
    private String expectedMessage;

    public FlashFieldHasErrorMessageCall(FlexSelenium flashApp, String objectId, String expectedMessage) {
        super();
        this.flashApp = flashApp;
        this.objectId = objectId;
        this.expectedMessage = expectedMessage;
    }

    @Override
    public boolean attemptCall() {
        String errorMessage = flashApp.getErrorString(objectId);
        if (errorMessage == null || !errorMessage.equals(expectedMessage)) {
            return false;
        }
        return true;
    }

    @Override
    public String getErrorMessage() {
        return "The error message for " + objectId + " did not have value '" + expectedMessage + "'" ;
    }

}
