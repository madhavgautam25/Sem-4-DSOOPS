class arithmeticOperations{
    int a;
    int b;

    arithmeticOperations(int a1, int b1) {
        a = a1;
        b = b1;
    }

    int add(){
        return a+b;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + a;
        result = prime * result + b;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        arithmeticOperations other = (arithmeticOperations) obj;
        if (a != other.a)
            return false;
        if (b != other.b)
            return false;
        return true;
    }

    

    
}
public class ObjectMethods {
    public static void main(String[] args) {
        arithmeticOperations t1 = new arithmeticOperations(2, 3);
        System.out.println(t1.add());
        System.out.println(t1.hashCode());
        arithmeticOperations t2 = new arithmeticOperations(2, 3);
        arithmeticOperations t3 = t2;
        System.out.println(t1.equals(t2));
        System.out.println(t2.equals(t3));
        System.out.println(t1.toString());
    }
    
}
