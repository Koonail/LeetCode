package easy;

/**
 * @Description
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * 示例 1:
 *
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 * 示例 2:
 *
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 * @Author Koonail
 * @Date 2019/7/7 14:40
 **/
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] jArray = J.toCharArray();
        char[] sArray = S.toCharArray();
        for (char j : jArray)
        {
            for (char s : sArray)
            {
                if (j == s)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        JewelsAndStones js = new JewelsAndStones();
        System.out.println(js.numJewelsInStones("aA","aAAbbbb"));
    }
}
