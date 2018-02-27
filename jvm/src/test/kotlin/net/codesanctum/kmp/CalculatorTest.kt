package net.codesanctum.kmp

import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it

class CalculatorTest : Spek({
    it("should be success") {
        val result = Calculator.add(1, 2)
        result.should.be.equal(3)
    }
})