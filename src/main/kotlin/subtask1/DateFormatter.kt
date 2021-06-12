package subtask1

import java.util.*


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        var textMonth = ""
        var dayNo = ""
        if (day.toInt() > 31 || month.toInt() > 12 || (month.toInt() == 2 && day.toInt() > 28)) {
            return "Такого дня не существует"
        } else {
            when (month) {
                "1" -> textMonth = "января"
                "2" -> textMonth = "февраля"
                "3" -> textMonth = "марта"
                "4" -> textMonth = "апреля"
                "5" -> textMonth = "мая"
                "6" -> textMonth = "июня"
                "7" -> textMonth = "июля"
                "8" -> textMonth = "августа"
                "9" -> textMonth = "сентября"
                "10" -> textMonth = "октября"
                "11" -> textMonth = "ноября"
                "12" -> textMonth = "декабря"
            }

            val c = Calendar.getInstance()
            c.set(year.toInt(), month.toInt(), day.toInt())
            when (c[Calendar.DAY_OF_WEEK]) {
                4 -> dayNo="воскресенье"
                5 -> dayNo="понедельник"
                6 -> dayNo="вторник"
                7 -> dayNo="четверг"
                1 -> dayNo="среда"
                2 -> dayNo="пятница"
                3 -> dayNo="суббота"
            }
            return "$day $textMonth, $dayNo"
        }
    }
}

