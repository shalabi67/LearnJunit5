package com.learn.junit5.facade;

public abstract class SocialSecurityNumber {
    public static SocialSecurityNumber create(String country) {
        switch(country.toLowerCase()) {
            case "usa": return new UsaSocialSecurityNumber();
            default: return new DefaultSocialSecurityNumber();
        }
    }
    public abstract boolean validate(String ssn);
}
class UsaSocialSecurityNumber extends SocialSecurityNumber {
    private String regularExpression = "^\\d{3}-\\d{2}-\\d{4}$";

    @Override
    public boolean validate(String ssn) {
        return ssn!=null && ssn.matches(regularExpression);
    }
}
class DefaultSocialSecurityNumber extends SocialSecurityNumber {
    @Override
    public boolean validate(String ssn) {
        return ssn!=null && !ssn.isEmpty();
    }
}