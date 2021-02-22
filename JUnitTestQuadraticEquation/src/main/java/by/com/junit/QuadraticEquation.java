package by.com.junit;

/**
 * Testing Quadratic Equation
 * Напишите и накройте тестами метод, решающий квадратное уравнение.
 * Спецификация метода.
 * Для заданного квадратного уравнения коэффициенты ( ax2 + bx + c = 0 ) возвращают массив с нулем,
 * одним или двумя действительными корнями уравнения. Корни в массиве могут быть в любом порядке.
 * Уточняйте поведение случая бесконечных корней самостоятельно.
 * Спецификация тестов.
 * Убедитесь, что метод работает нормально в общих случаях:
 * два существующих корня
 * один выходящий корень
 * без корней
 * Убедитесь, что метод работает правильно, если некоторые из коэффициентов равны нулю
 * Убедитесь, что метод работает правильно в особых случаях (например, когда все коэффициенты равны нулю)
 * Шаги:
 * Завершите метод
 * Завершите тесты (сначала тесты могут быть - TDD).
 * Где: a, b, c - действительные числа и не могут быть равны нулю, т.е. значение должно быть от {-∞ до -1} и от {1 до ∞}
 */
public class QuadraticEquation {

    public static double[] quadraticEquation(int a, int b, int c) {
        if (a == 0) {
            return new double[]{(double) -c / b};
        }
        else {
            double discriminant = Math.pow(b, 2) - (4* a* c);
            if (discriminant > 0) {
                return new double[]{
                        (-b - Math.sqrt(discriminant)) / (2 * a),
                        (-b + Math.sqrt(discriminant)) / (2 * a)};
            } else if (discriminant == 0) {
                return new double[]{(double) -b / 2 * a};
            } else {
                return new double[]{};
            }
        }
    }
}