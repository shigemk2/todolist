package model

case class Task(id: Long, label: String)

object Task {
  object Task {
    def all(): List[Task] = Nil

    def create(label: String) {}

    def delete(id: Long) {}
  }
}
