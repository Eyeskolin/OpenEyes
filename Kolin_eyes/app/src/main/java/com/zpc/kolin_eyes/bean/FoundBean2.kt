package com.zpc.kolin_eyes.bean

/**
 * Created by lenovo on 2017/12/28.
 */

class FoundBean2 {

    /**
     * count : 10
     * total : 0
     * nextPageUrl : http://baobab.kaiyanapp.com/api/v3/videos?start=12&num=10&categoryName=%E6%97%B6%E5%B0%9A&strategy=date
     * adExist : false
     */

    var count: Int = 0
    var total: Int = 0
    var nextPageUrl: String? = null
    var isAdExist: Boolean = false
    var itemList: List<ItemListBean>? = null


    class ItemListBean {
        /**
         * type : video
         * tag : null
         * id : 0
         * adIndex : -1
         */


        var type: String? = null
        var data: DataBean? = null
        var tag: Any? = null
        var id: Int = 0
        var adIndex: Int = 0

        class DataBean {


            var dataType: String? = null
            var id: Int = 0
            var title: String? = null
            var slogan: Any? = null
            var description: String? = null
            var provider: ProviderBean? = null
            var category: String? = null
            var author: AuthorBean? = null
            var cover: CoverBean? = null
            var playUrl: String? = null
            var thumbPlayUrl: Any? = null
            var duration: Int = 0
            var webUrl: WebUrlBean? = null
            var releaseTime: Long = 0
            var library: String? = null
            var consumption: ConsumptionBean? = null
            var campaign: Any? = null
            var waterMarks: Any? = null
            var adTrack: Any? = null
            var type: String? = null
            var titlePgc: String? = null
            var descriptionPgc: String? = null
            var remark: Any? = null
            var idx: Int = 0
            var shareAdTrack: Any? = null
            var favoriteAdTrack: Any? = null
            var webAdTrack: Any? = null
            var date: Long = 0
            var promotion: Any? = null
            var label: Any? = null
            var descriptionEditor: String? = null
            var isCollected: Boolean = false
            var isPlayed: Boolean = false
            var lastViewTime: Any? = null
            var playlists: Any? = null
            var src: Any? = null
            var playInfo: List<PlayInfoBean>? = null
            var tags: List<TagsBean>? = null
            var labelList: List<*>? = null
            var subtitles: List<*>? = null

            class ProviderBean {
                /**
                 * name : 定制来源
                 * alias : CustomSrc
                 * icon :
                 */

                var name: String? = null
                var alias: String? = null
                var icon: String? = null
            }

            class AuthorBean {
                /**
                 * id : 2346
                 * icon : http://img.kaiyanapp.com/d8e1964ef739ba80ee1799a41e5bf9ca.jpeg?imageMogr2/quality/60/format/jpg
                 * name :  Sit with Dani
                 * description : Hi 大家好，我是Dani! 快进来坐！Come sit with me！ 在这里我会每天分享美妝，时尚以及生活大小事！
                 * link :
                 * latestReleaseTime : 1514376901000
                 * videoNum : 4
                 * adTrack : null
                 * follow : {"itemType":"author","itemId":2346,"followed":false}
                 * shield : {"itemType":"author","itemId":2346,"shielded":false}
                 * approvedNotReadyVideoCount : 0
                 * ifPgc : true
                 */

                var id: Int = 0
                var icon: String? = null
                var name: String? = null
                var description: String? = null
                var link: String? = null
                var latestReleaseTime: Long = 0
                var videoNum: Int = 0
                var adTrack: Any? = null
                var follow: FollowBean? = null
                var shield: ShieldBean? = null
                var approvedNotReadyVideoCount: Int = 0
                var isIfPgc: Boolean = false

                class FollowBean {
                    /**
                     * itemType : author
                     * itemId : 2346
                     * followed : false
                     */

                    var itemType: String? = null
                    var itemId: Int = 0
                    var isFollowed: Boolean = false
                }

                class ShieldBean {
                    /**
                     * itemType : author
                     * itemId : 2346
                     * shielded : false
                     */

                    var itemType: String? = null
                    var itemId: Int = 0
                    var isShielded: Boolean = false
                }
            }

            class CoverBean {
                /**
                 * feed : http://img.kaiyanapp.com/0118b527770b01b5b19918baaf9b1107.jpeg?imageMogr2/quality/60/format/jpg
                 * detail : http://img.kaiyanapp.com/0118b527770b01b5b19918baaf9b1107.jpeg?imageMogr2/quality/60/format/jpg
                 * blurred : http://img.kaiyanapp.com/440d0a5509cb2f2e9dd4e2d8366028b8.jpeg?imageMogr2/quality/60/format/jpg
                 * sharing : null
                 * homepage : null
                 */

                var feed: String? = null
                var detail: String? = null
                var blurred: String? = null
                var sharing: Any? = null
                var homepage: Any? = null
            }

            class WebUrlBean {
                /**
                 * raw : http://www.eyepetizer.net/detail.html?vid=69267
                 * forWeibo : http://www.eyepetizer.net/detail.html?vid=69267
                 */

                var raw: String? = null
                var forWeibo: String? = null
            }

            class ConsumptionBean {
                /**
                 * collectionCount : 4
                 * shareCount : 0
                 * replyCount : 0
                 */

                var collectionCount: Int = 0
                var shareCount: Int = 0
                var replyCount: Int = 0
            }

            class PlayInfoBean {
                /**
                 * height : 480
                 * width : 854
                 * urlList : [{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69267&editionType=normal&source=aliyun","size":40093695},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69267&editionType=normal&source=qcloud","size":40093695},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69267&editionType=normal&source=ucloud","size":40093695}]
                 * name : 标清
                 * type : normal
                 * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69267&editionType=normal&source=aliyun
                 */

                var height: Int = 0
                var width: Int = 0
                var name: String? = null
                var type: String? = null
                var url: String? = null
                var urlList: List<UrlListBean>? = null

                class UrlListBean {
                    /**
                     * name : aliyun
                     * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=69267&editionType=normal&source=aliyun
                     * size : 40093695
                     */

                    var name: String? = null
                    var url: String? = null
                    var size: Int = 0
                }
            }

            class TagsBean {
                /**
                 * id : 236
                 * name : 美妆教程
                 * actionUrl : eyepetizer://tag/236/?title=%E7%BE%8E%E5%A6%86%E6%95%99%E7%A8%8B
                 * adTrack : null
                 * desc :
                 * bgPicture : http://img.kaiyanapp.com/9c02632760f000e98420f24c66e279ba.jpeg?imageMogr2/quality/60/format/jpg
                 * headerImage : http://img.kaiyanapp.com/9c02632760f000e98420f24c66e279ba.jpeg?imageMogr2/quality/60/format/jpg
                 * tagRecType : IMPORTANT
                 */

                var id: Int = 0
                var name: String? = null
                var actionUrl: String? = null
                var adTrack: Any? = null
                var desc: String? = null
                var bgPicture: String? = null
                var headerImage: String? = null
                var tagRecType: String? = null
            }
        }

        override fun toString(): String {
            return "ItemListBean(type=$type, data=$data, tag=$tag, id=$id, adIndex=$adIndex)"
        }
    }

    override fun toString(): String {
        return "FoundBean2(count=$count, total=$total, nextPageUrl=$nextPageUrl, isAdExist=$isAdExist, itemList=$itemList)"
    }
}
