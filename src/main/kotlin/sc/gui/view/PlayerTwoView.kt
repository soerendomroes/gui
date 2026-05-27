package sc.gui.view
import javafx.geometry.Pos
import javafx.scene.control.Label
import javafx.scene.paint.Color
import sc.api.plugins.Team
import sc.gui.model.AppModel
import sc.gui.model.GameModel
import sc.gui.strings
import tornadofx.*

class PlayerTwoView: View() {
    private val game: GameModel by inject()
    override val root = hbox {
        useMaxWidth = true
        alignment = Pos.CENTER
        add(playerLabel(game, Team.TWO))
    }
}