package rs.nmarinkovic.subsets;

public class ELSK
{
    private String value;
    private Boolean member;

    public ELSK(String value) {
        this.value = value;
        this.member = false;
    }

    public ELSK(ELSK e) {
        this.value = e.value;
        this.member = e.member;
    }

    public String getValue() {
        return value;
    }

    public Boolean isMember() {
        return member;
    }

    public void setMember(Boolean member) {
        this.member = member;
    }
}
