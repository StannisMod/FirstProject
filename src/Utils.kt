public data class Inventory (var size: Int) {

    private val inv = Array<Int>(size, {0});

    public fun storeThing(thing : Int): Boolean {
        for (i in 0..(inv.size - 1)) {
            val item = inv.get(i);
            if (item == 0) {
                inv.set(i, thing);
                return true;
            }
        }
        return false;
    }

    public fun dropThing(id : Int): Boolean {
        if (id < 0 || id > inv.size)
            return false;

        if (inv.get(id) != 0) {
            inv.set(id, 0);
            return true;
        }

        return false;
    }

    override fun toString(): String {
        return "Inventory[1: $inv[0], 2: $inv[1], 3: $inv[2], 4: $inv[3], 5: $inv[4], 6: $inv[5], 7: $inv[6], 8: $inv[7], 9: $inv[8], 10: $inv[9]]";
    }
}