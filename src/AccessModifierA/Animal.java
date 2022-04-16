package AccessModifierA;

public class Animal {
    /*
    * Trong Java có tất cả 4 loại access modifier:
    * Xét theo phạm vi truy cập từ nhỏ đến lớn
    * private < default < protected < public
    * Private: chỉ truy cập được trong phạm vi class
    * Default: mặc định. Chỉ truy cập được trong phạm vi class và các class cùng package
    * Protected: truy cập được thêm ở class kế thừa khác package
    * Public: có phạm vi truy cập rộng nhất
    * Các từ khóa default và public dùng được cho class
    * Còn các từ khóa còn lại dùng được cho cả property và method
    *
    * Các class có phạm vi truy cập là default (k sử dụng từ khóa public khi tạo mới)
    * thì chỉ được truy cập trong phạm vi package.
    * Các class khi khởi tạo có kèm từ khóa final (coi như 1 class hoàn chính)
    * thì không cho phép các class khác kế thừa nhưng vẫn có thể truy cập thông
    * qua khởi tạo đối tượng. Điều này khác với các abstract class.
    * */

    private int weight = 10;

    String eat() {
        // weight = 10;
        return "Food";
    }

    protected int length = 10;

    public String drink() {
        return "Water";
    }
}
