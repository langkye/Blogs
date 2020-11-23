package com.langkye.common.utils;

import com.langkye.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author langkye
 */
public class ShiroUtils {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}