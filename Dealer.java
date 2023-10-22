public class Dealer{
    private String dealerCode;
    private String name;
    private String state;
    private int lisence;
    
    public String getDealerCode() {
        return dealerCode;
    }
    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getLisence() {
        return lisence;
    }
    public void setLisence(int lisence) {
        this.lisence = lisence;
    }
    public int getStore() {
        return store;
    }
    public void setStore(int store) {
        this.store = store;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    private int store;
    private String status;
    
}