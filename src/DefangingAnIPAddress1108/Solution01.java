package DefangingAnIPAddress1108;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/defanging-an-ip-address/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/17 16:29
 * @Version 1.0
 */
public class Solution01 {

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
