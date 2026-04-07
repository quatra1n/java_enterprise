package eweb.pract2_serealizable.ex_001_json;

import eweb.pract2_serealizable.JacksonDataBind;
import eweb.pract2_serealizable.ex_001_json.entity.Product;
import eweb.pract2_serealizable.ex_001_json.entity.SiteInfo;
import eweb.pract2_serealizable.ex_001_json.entity.User;

public class Main {
    public static void main(String[] args) {
        System.out.println(JacksonDataBind.parseJson(
                "D:\\JAVA\\java_enterprise\\src\\main\\resources\\json_pract\\user.json",
                User.class));
        System.out.println(JacksonDataBind.parseJson(
                "D:\\JAVA\\java_enterprise\\src\\main\\resources\\json_pract\\product.json",
                Product.class));
        System.out.println(JacksonDataBind.parseJson(
                "D:\\JAVA\\java_enterprise\\src\\main\\resources\\json_pract\\article.json",
                SiteInfo.class));




    }
}
