trait Repository {
  def save(user: User)
}

trait DatabaseRepository extends Repository { /* ... */ }

trait UserService { self: Repository => // requires Repository
  def create(user: User) {
    // ...
    save(user)
  }
}

new UserService with DatabaseRepository
