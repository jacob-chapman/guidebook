import com.jacobchapman.guidebook.Layout
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Main
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        Layout {
            Main {
                Button(attrs = {
                    onClick { println("Click") }
                }) {
                    Text("Click Me!")
                }
            }
        }
    }
}

