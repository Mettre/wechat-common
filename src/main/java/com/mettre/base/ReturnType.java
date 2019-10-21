package com.mettre.base;

import com.mettre.enum_.ResultEnum;
import com.mettre.exception.CustomerException;

public class ReturnType {

    public static int ReturnType(int type, ResultEnum resultEnum) {
        if (type < 1) {
            throw new CustomerException(resultEnum);
        }
        return type;
    }

    public static Object ReturnType(Object object, ResultEnum resultEnum) {
        if (object ==null) {
            throw new CustomerException(resultEnum);
        }
        return object;
    }
}
