import main.Generators.WaterGroupGenerator
import main.Objects.Water

fun main(){
    val waterGroupGenerator = WaterGroupGenerator(1,10)
    val waterGroup: MutableList<Water> = waterGroupGenerator.getWaterGroup()

    for (i in 0 until waterGroup.count()){
        println('\n'+"Вода №" + (i + 1))
        println("Прозрачность: " + if (waterGroup[i].transparency) "прозрачная" else "непрозрачная")
        println("Физическое состояние: " + waterGroup[i].condition)
        println("Температура: " + "%.2f".format(waterGroup[i].temperature) + " градусов")
        println("Безопасность: " + if (waterGroup[i].safety) "безопасна для питья при нормальных условиях" else "небезопасна для питья")
    }
}
