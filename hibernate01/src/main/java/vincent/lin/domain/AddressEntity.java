package vincent.lin.domain;

/**
 * Created by Administrator on 2017/1/8.
 */
public class AddressEntity {
    private String postcode;
    private String phone;
    private String address;

    public AddressEntity(String postcode, String phone, String address) {
        this.postcode = postcode;
        this.phone = phone;
        this.address = address;
    }

    public AddressEntity() {
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
