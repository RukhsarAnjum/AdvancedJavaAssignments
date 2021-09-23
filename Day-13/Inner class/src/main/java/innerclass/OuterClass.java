package innerclass;

public class OuterClass {
    private String name="Rukhsar";

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
// 1.Member inner class....A class created with in class and outside method
    class InnerClass{
        private String innerName;

        public String getInnerName() {
            return innerName;
        }

        public void setInnerName(String innerName) {
            this.innerName = innerName;
        }
        public void getnameOfOuterClass(){
            System.out.println("Outer class name is here");
        }
    }
}
