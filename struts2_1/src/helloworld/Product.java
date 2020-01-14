package helloworld;

/**
 * Action 类
 */
public class Product {
    private Integer productId;

    private String productName;
    private double productPrice;
    private String description;

    public Product() {
        System.out.println("Product constructor.....");//验证是否单实例
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName2() {
        return productName;
    }

    public void setProductName2(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String save(){
        this.setProductId(1001);
        System.out.println("saving: "+this);
        return "details";
    }
    public  String test(){
        System.out.println("test");
        return "success";
    }
    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
