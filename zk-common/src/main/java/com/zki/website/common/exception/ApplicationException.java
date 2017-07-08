package com.zki.website.common.exception;

/**
 * Filename:    com.zki.website.common.exception
 * Copyright:   Copyright (c)2017
 * Company:     北京众智科技有限公司
 *
 * @author: crazy
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2017-07-09 02:12
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2017-07-09  LPF      1.0     1.0 Version
 */
public class ApplicationException extends Exception{

    public ApplicationException() {
        super();
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }

}
