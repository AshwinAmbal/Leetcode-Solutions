class Solution {
    public int calPoints(String[] ops) {
        Stack stack = new Stack();
        int total = 0;
        for(int i = 0; i < ops.length; i++){
            if(ops[i].equals("C")){
                int num = (Integer)stack.pop();
                total -= num;
            }
            else if(ops[i].equals("D")){
                int num = (Integer)stack.peek() * 2;
                total += num;
                stack.push(num);
            }
            else if(ops[i].equals("+")){
                int num1 = (Integer)stack.pop();
                int num2 = (Integer)stack.pop();
                total += num1 + num2;
                stack.push(num2);
                stack.push(num1);
                stack.push(num1+num2);
            }
            else{
                int num = Integer.parseInt(ops[i]);
                total += num;
                stack.push(num);
            }
        }
        return total;
    }
}