package yenyen.models.account;

import com.google.gson.JsonObject;

public class Like {
    private String action;
    private String about;
    private String gender;
    private String fullname;
    private String birthday;
    private String job;
    private String company;
    private String education;
    private String[] languages;
    private String[] sexual_orientations;
    private String[] interests;
    private String[] images_to_delete;
    private String avatar;
    private String[] images;
    private String latitude;
    private String longitude;
    private String show_me;
    private Age age_range;
    private int maximum_distance;
    private int show_me_on_app;
    private int show_me_on_top_pick;
    private int show_photo;
    private int show_about;
    private int show_education;
    private int show_work;
    private int enable_email_notification;
    private int enable_push_notification;
    private int drink_state;
    private int smoke_state;
    private String relationship_status;
    private int enable_push_notification_new_matches;
    private int enable_push_notification_messages;
    private int enable_push_notification_message_likes;
    private int enable_push_notification_super_likes;
    private int enable_push_notification_top_picks;

    public Like(){}
    public Like(LikeBuilder builder){
        this.action = builder.action;
        this.about = builder.about;
        this.gender=builder.gender;
        this.fullname = builder.fullname;
        this.birthday = builder.birthday;
        this.job = builder.job;
        this.company = builder.company;
        this.education = builder.education;
        this.languages = builder.languages;
        this.sexual_orientations = builder.sexual_orientations;
        this.interests = builder.interests;
        this.images_to_delete = builder.images_to_delete;
        this.avatar = builder.avatar;
        this.images = builder.images;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.show_me = builder.show_me;
        this.age_range = builder.age_range;
        this.maximum_distance = builder.maximum_distance;
        this.show_me_on_app= builder.show_me_on_app;
        this.show_me_on_top_pick = builder.show_me_on_top_pick;
        this.show_about = builder.show_about;
        this.show_education = builder.show_education;
        this.show_photo = builder.show_photo;
        this.show_work = builder.show_work;
        this.drink_state = builder.drink_state;
        this.smoke_state = builder.smoke_state;
        this.relationship_status = builder.relationship_status;
        this.enable_email_notification = builder.enable_email_notification;
        this.enable_push_notification = builder.enable_push_notification;
        this.enable_push_notification_message_likes = builder.enable_push_notification_message_likes;
        this.enable_push_notification_messages = builder.enable_push_notification_messages;
        this.enable_push_notification_new_matches = builder.enable_push_notification_new_matches;
        this.enable_push_notification_super_likes = builder.enable_push_notification_super_likes;
        this.enable_push_notification_top_picks = builder.enable_push_notification_top_picks;
    }

    public static class LikeBuilder{

        private String action;
        private String about;
        private String gender;
        private String fullname;
        private String birthday;
        private String job;
        private String company;
        private String education;
        private String[] languages;
        private String[] sexual_orientations;
        private String[] interests;
        private String[] images_to_delete;
        private String avatar;
        private String[] images;
        private String latitude;
        private String longitude;
        private String show_me;
        private Age age_range;
        private int min;
        private int max;
        private int maximum_distance;
        private int show_me_on_app;
        private int show_me_on_top_pick;
        private int show_photo;
        private int show_about;
        private int show_education;
        private int show_work;
        private int enable_email_notification;
        private int enable_push_notification;
        private int drink_state;
        private int smoke_state;
        private String relationship_status;
        private int enable_push_notification_new_matches;
        private int enable_push_notification_messages;
        private int enable_push_notification_message_likes;
        private int enable_push_notification_super_likes;
        private int enable_push_notification_top_picks;


        public LikeBuilder(){}
        public LikeBuilder(String action, String fullname){
            this.action = action;
            this.fullname=fullname;
//            this.birthday = birthday;

        }

        public LikeBuilder setAvatar(String avatar){
            this.avatar = avatar;
            return this;
        }

        public Like build(){
            return new Like(this);
        }

        public LikeBuilder setAbout(String about) {
            this.about = about;
            return this;
        }

        public LikeBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public LikeBuilder setJob(String job) {
            this.job = job;
            return this;
        }

        public LikeBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public LikeBuilder setEducation(String education) {
            this.education = education;
            return this;
        }

        public LikeBuilder setLanguages(String[] languages) {
            this.languages = languages;
            return this;
        }

        public LikeBuilder setSexual_orientations(String[] sexual_orientations) {
            this.sexual_orientations = sexual_orientations;
            return this;
        }

        public LikeBuilder setInterests(String[] interests) {
            this.interests = interests;
            return this;
        }

        public LikeBuilder setImages_to_delete(String[] images_to_delete) {
            this.images_to_delete = images_to_delete;
            return this;
        }

        public LikeBuilder setImages(String[] images) {
            this.images = images;
            return this;
        }

        public LikeBuilder setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }

        public LikeBuilder setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }

        public LikeBuilder setShow_me(String show_me) {
            this.show_me = show_me;
            return this;
        }

//        public LikeBuilder setAge_range(int min, int max) {
//            JsonObject age_range = ageRange(min, max);
//            this.age_range = age_range;
//            return this;
//        }

//        public LikeBuilder setAge_range(JsonObject jsonObject){
//            this.age_range = jsonObject;
//            return this;
//        }
        public LikeBuilder setAge_range(Age jsonObject){
            this.age_range = jsonObject;
            return this;
        }

        public JsonObject ageRange(int min, int max){
            JsonObject age_range = new JsonObject();
            age_range.addProperty("min", min);
            age_range.addProperty("max", max);
            return age_range;
        }

        public LikeBuilder setMaximum_distance(int maximum_distance) {
            this.maximum_distance = maximum_distance;
            return this;
        }

        public LikeBuilder setShow_me_on_app(int show_me_on_app) {
            this.show_me_on_app = show_me_on_app;
            return this;
        }

        public LikeBuilder setShow_me_on_top_pick(int show_me_on_top_pick) {
            this.show_me_on_top_pick = show_me_on_top_pick;
            return this;
        }

        public LikeBuilder setShow_photo(int show_photo) {
            this.show_photo = show_photo;
            return this;
        }

        public LikeBuilder setShow_about(int show_about) {
            this.show_about = show_about;
            return this;
        }

        public LikeBuilder setShow_education(int show_education) {
            this.show_education = show_education;
            return this;
        }

        public LikeBuilder setShow_work(int show_work) {
            this.show_work = show_work;
            return this;
        }

        public LikeBuilder setEnable_email_notification(int enable_email_notification) {
            this.enable_email_notification = enable_email_notification;
            return this;
        }

        public LikeBuilder setEnable_push_notification(int enable_push_notification) {
            this.enable_push_notification = enable_push_notification;
            return this;
        }

        public LikeBuilder setDrink_state(int drink_state) {
            this.drink_state = drink_state;
            return this;
        }

        public LikeBuilder setSmoke_state(int smoke_state) {
            this.smoke_state = smoke_state;
            return this;
        }

        public LikeBuilder setRelationship_status(String relationship_status) {
            this.relationship_status = relationship_status;
            return this;
        }

        public LikeBuilder setEnable_push_notification_new_matches(int enable_push_notification_new_matches) {
            this.enable_push_notification_new_matches = enable_push_notification_new_matches;
            return this;
        }

        public LikeBuilder setEnable_push_notification_messages(int enable_push_notification_messages) {
            this.enable_push_notification_messages = enable_push_notification_messages;
            return this;
        }

        public LikeBuilder setEnable_push_notification_message_likes(int enable_push_notification_message_likes) {
            this.enable_push_notification_message_likes = enable_push_notification_message_likes;
            return this;
        }

        public LikeBuilder setEnable_push_notification_super_likes(int enable_push_notification_super_likes) {
            this.enable_push_notification_super_likes = enable_push_notification_super_likes;
            return this;
        }

        public LikeBuilder setEnable_push_notification_top_picks(int enable_push_notification_top_picks) {
            this.enable_push_notification_top_picks = enable_push_notification_top_picks;
            return this;
        }
////sử dụng builder khi Tạo một đối tượng phức tạp: có nhiều thuộc tính (nhiều hơn 4) và một số bắt buộc (requried), một số không bắt buộc (optional).
////Khi có quá nhiều hàm constructor
    }

}






