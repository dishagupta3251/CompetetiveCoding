class Solution {
public:
    string convertToTitle(int columnNumber) {
        string str="";
        int col=columnNumber;
        while(col>=1)
        {
            col--;
            str=(char)(col%26+65)+str;
            col=col/26;
        }
        return str;
    }
};