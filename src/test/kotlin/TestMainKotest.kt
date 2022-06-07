import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class TestMainKotest : StringSpec({
    "sum should work" {
        sum(1, 2) shouldBe 3
    }
})