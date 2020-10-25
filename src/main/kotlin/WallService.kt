object WallService {
    val service = WallServiceCore()
}

fun main() {
    WallService.service.add(Post(text = "Это... ну... вы понимаете"))
    WallService.service.add(Post(text = "Дальше вот это вот"))
    WallService.service.update(Post(id = 2, text = "Ну вот это вот"))
    WallService.service.add(Post(text = "Чем чьих?"))

}
