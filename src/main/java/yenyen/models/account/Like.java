package yenyen.models.account;

import com.google.gson.JsonObject;

public class Like {

    public Like(){

    }

    public static class LikeBuilder{

        private String action;
        private String about;
        private String gender;
        private String full_name;
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
        private JsonObject age_range;
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

        public LikeBuilder(String action, String full_name, String birthday, String avatar){
            this.action = action;
            this.full_name=full_name;
            this.birthday = birthday;
            this.avatar = avatar;
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

        public LikeBuilder setAge_range(JsonObject age_range) {
            this.age_range = age_range;
            return this;
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

    }

}






