fun main(){
    var student:Student? = Student()

    val unit = student?.let { st -> //не возвращает обратного значения;
                                    // работаем с объектом через ключевое слово st
        st.hi()
        st.bye()
        st.name = "Masha"
    }
    println(student?.name)
    println()
    val student2 = student?.apply { //возвращает измененный объект
                                    //работает с содержими объекта
        hi()
        bye()
        name = "Andrew"
    }
    println(student?.name)
    println(student2?.name)
    println()
    val count = Student().run{  //возвращает обратное значение из последней строки
                                //работает с содержимым объекта
        hi()
        bye()
        countOfDebts = 15
        countOfDebts
    }
    println(count)         //run = with, но открываются по разному
    println()
    val str = with(Student()){  //возвращает обратное значение из последней строки
                                //работает с содержимым объекта
        hi()
        bye()
        name = "Pasha"
        name
    }
    println(str)
    println()
    val student3 = Student().also{st->  //возвращает измененный объект
                                        //работаем с объектом через ключевое слово
        st.hi()
        st.bye()
        st.countOfDebts = 5
    }
    println(student3)
    println()

}