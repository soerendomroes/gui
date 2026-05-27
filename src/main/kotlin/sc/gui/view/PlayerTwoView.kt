package sc.gui.view
import javafx.geometry.Insets
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
        // Run this later since scene is not ready yet
        runLater {
            prefWidthProperty().bind(scene.widthProperty().divide(4))
            this.padding = Insets(0.0, scene.width / 100, 0.0, scene.width / 100)
        }
        alignment = Pos.TOP_CENTER
        add(playerLabel(game, Team.TWO))
    }
}