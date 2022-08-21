fun main() {
    val amount = 10000_00
    val commissionRate = 0.0075
    val minCommission = 35_00
    val result = if (amount * commissionRate < minCommission) minCommission else (amount * commissionRate)
    println("Комиссия за перевод: " + result + " коп.")

    }
