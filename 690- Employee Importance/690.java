/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for(Employee e : employees) map.put(e.id, e);
        Employee e = map.get(id);
        LinkedList<Employee> queue = new LinkedList<>();
        queue.add(e);
        int total = 0;
        while(!queue.isEmpty()) {
            Employee cur = queue.removeFirst();
            total += cur.importance;
            for(int num : cur.subordinates)
                queue.add(map.get(num));
        }
        return total;
    }
}