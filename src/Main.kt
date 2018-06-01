
data class Hero(var name : String, var HP : Double, var XP : Double, var lvl : Int, var strength : Double, var MaxHP : Double, var MaxXP : Double, var nextLvlXP : Double) {

    private val inv = Inventory(10);

    public fun lvlUp() {
        lvl++;
        MaxHP = MaxHP * 1.1;
        strength += if (lvl % 2 == 0) 1 else 0;
        nextLvlXP *= 2;
        HP = MaxHP;
    }

    public fun setDeath() {
        XP = 0.0;
        HP = MaxHP * 0.05;
        strength = 1.0;
    }

    fun addXP(newXP : Int){
        println("Got ${newXP} XP");
        XP += newXP;
        if (XP > nextLvlXP) lvlUp();
    }

    override fun toString(): String {
        return "Hero[Name: $name, XP: $XP, HP: $HP, Level: $lvl, Strength: $strength, MaxHP: $MaxHP, MaxXP: $MaxXP]";
    }


}

fun main(Args: Array<String>) {

    var myhero = Hero("Stannis", 20.0, 0.0, 0, 5.0, 20.0, 10.0, 50.0);
    println(myhero);
    myhero.setDeath();
    println(myhero);
}




















































/*
fun main(Args: Array<String>) {

    val text = "Смешанные чувства теснятся в груди моей, когда я приступаю к описанию этой экспедиции, принесшей мне больше, нежели я мог надеяться. Отправляясь в путь с Земли, я назначил себе целью достижение невероятно далекой планеты в созвездии Краба, Зазьявы, слава о которой разносится по всей космической пустоте благодаря тому, что она подарила Вселенной одну из наиболее выдающихся ее личностей, Учителя Ох. Не так на самом деле зовут сего блестящего мыслителя, я же пользуюсь этим именем, ибо ни один земной язык не в состоянии передать его иным образом. Ребенку, рождающемуся на Зазьяве, вместе с необыкновенно длинным, по нашим представлениям, именем присваивают несметное множество титулов и отличий.Когда в свое время Учитель Ох пришел в мир, его нарекли именем Гридипидагититоситипопокартуртегвауана-топочтоэтотам. Он получил титулы Златотканого Оплота Бытия, Доктора Совершенной Кротости, Светлой Вероятностной Всесторонности и т.д. и т.п. По мере того как он мужал и учился, каждый год его лишали одного титула и частички имени, а поскольку способности он выказывал необычайные, уже на тридцать третьем году жизни у него отобрали последнее отличие, спустя же еще два года у него вообще не осталось титулов, а имя его обозначалось одной только – да к тому же немой – буквой зазьявского алфавита: «придыхание блаженства», то есть особого рода подавленный вздох, который издают от избытка уважения и наслаждения."

    val words = text.split(" ");
    val sentences = text.split(".", "!", "?");
    val words_count = Array<Int>(words.size, {0})

    println("Слов: ${words.size}");
    println("Предложений: ${sentences.size}");

    for (i in 0..(words.size - 1))
        ;// ...

    /*
    if (Args.size >= 4)
        print(d(Args[0].toDouble(), Args[1].toDouble(), Args[2].toDouble(), Args[3].toDouble()));
    else
        print("NULL input");
        */
}
*/

fun format(name: String, surname: String): String = "Фамилия: ${surname}, Имя: ${name}"

fun rect(a: Double, b: Double): Double = a * b