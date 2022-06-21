public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        // заполните другие поля
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = "true";
        post.surname = "Иванов";
        post.birthday = new FormDate();
        post.birthday.day = "13";
        // заполните другие поля даты рождения
        post.birthday.month = "6";
        post.birthday.year = "1999";
    }
}
