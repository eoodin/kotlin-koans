package iv_builders

import iv_builders.data.getProducts
import iv_builders.htmlLibrary.*
import util.TODO

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"

fun todoTask19() = TODO(
    """
        Task19.
        1) Fill the table with proper values from products.
        2) Color the table in a chess order (using getTitleColor() and getCellColor() functions above).
        You can run 'Html Demo' configuration to see the rendered table
    """
)

fun renderProductTable(): String {
    return html {
        table {
            tr {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            todoTask19()
        }
    }.toString()
}
