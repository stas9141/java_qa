package com.cyberobserver.model;

public class ExcludeParameterToCscData {
    private final String installation;
    private final String validto;
    private final String dnname;
    private final String status;
    private final String approver;
    private final String name;
    private final String comname;
    private final String parentdn;
    private final String issuer;
    private final String validstate;
    private final String manualcsr;
    private final String country;
    private final String signalg;
    private final String organization;
    private final String managtype;
    private final String keysize;
    private final String description;
    private final String ellipticcurve;
    private final String keyalg;
    private final String risk;
    private final String device;

    public ExcludeParameterToCscData(String installation, String validto, String dnname, String status,
                                     String approver, String name, String comname, String parentdn, String issuer,
                                     String validstate, String manualcsr, String country, String signalg,
                                     String organization, String managtype, String keysize, String description,
                                     String ellipticcurve, String keyalg, String risk, String device) {
        this.installation = installation;
        this.validto = validto;
        this.dnname = dnname;
        this.status = status;
        this.approver = approver;
        this.name = name;
        this.comname = comname;
        this.parentdn = parentdn;
        this.issuer = issuer;
        this.validstate = validstate;
        this.manualcsr = manualcsr;
        this.country = country;
        this.signalg = signalg;
        this.organization = organization;
        this.managtype = managtype;
        this.keysize = keysize;
        this.description = description;
        this.ellipticcurve = ellipticcurve;
        this.keyalg = keyalg;
        this.risk = risk;
        this.device = device;
    }

    public String getInstallation() {
        return installation;
    }

    public String getValidto() {
        return validto;
    }

    public String getDnname() {
        return dnname;
    }

    public String getStatus() {
        return status;
    }

    public String getApprover() {
        return approver;
    }

    public String getName() {
        return name;
    }

    public String getComname() {
        return comname;
    }

    public String getParentdn() {
        return parentdn;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getValidstate() {
        return validstate;
    }

    public String getManualcsr() {
        return manualcsr;
    }

    public String getCountry() {
        return country;
    }

    public String getSignalg() {
        return signalg;
    }

    public String getOrganization() {
        return organization;
    }

    public String getManagtype() {
        return managtype;
    }

    public String getKeysize() {
        return keysize;
    }

    public String getDescription() {
        return description;
    }

    public String getEllipticcurve() {
        return ellipticcurve;
    }

    public String getKeyalg() {
        return keyalg;
    }

    public String getRisk() {
        return risk;
    }

    public String getDevice() {
        return device;
    }
}
