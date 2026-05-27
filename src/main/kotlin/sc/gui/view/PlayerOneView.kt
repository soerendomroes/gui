package sc.gui.view
import javafx.geometry.Pos
import javafx.scene.control.Label
import javafx.scene.paint.Color
import sc.api.plugins.Team
import sc.gui.AppStyle
import sc.gui.model.AppModel
import sc.gui.model.GameModel
import sc.gui.strings
import tornadofx.*

class PlayerOneView: View() {
    private val game: GameModel by inject()
    override val root = hbox {
        useMaxWidth = true
        this.spacing = AppStyle.fontSizeUnscaled.value
        alignment = Pos.CENTER
        add(playerLabel(game, Team.ONE))
    }
}