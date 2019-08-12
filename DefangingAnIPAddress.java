package easy;

/**
 * @Description:
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 *
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 * @Author Koonail
 * @Date 2019/7/30 21:47
 **/
public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        StringBuilder sbResult = new StringBuilder();
        for (char c : address.toCharArray()){
            if ('.' == c){
                sbResult.append("[.]");
                continue;
            }
            sbResult.append(c);
        }
        return sbResult.toString();
    }
}
