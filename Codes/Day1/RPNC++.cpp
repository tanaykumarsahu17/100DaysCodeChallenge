class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<long int> st;
        
        for(auto c : tokens) {
            if(c == "+" || c == "-" || c == "*" || c == "/") {
                               
                long int right = st.top();
                st.pop();
                long int left = st.top();
                st.pop();
                long int result;
                
                if (c == "+") {
                    result = left + right;
                } else if (c == "-") {
                    result = left - right;
                } else if (c == "*") {
                    result = left * right;
                } else {
                    result = left / right;
                }
                st.push(result);
            } else {
                st.push(stoi(c));
            }
        }

        return st.top();
    }
};
