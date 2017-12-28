package com.zpc.kolin_eyes.bean

/**
 * Created by FLOWER on 2017/12/28.
 */

class Homeinfo {

    var nextPageUrl: String? = null
    var nextPublishTime: Long = 0
    var newestIssueType: String? = null
    var dialog: Any? = null
    var issueList: List<IssueListBean>? = null

    class IssueListBean {


        var releaseTime: Long = 0
        var type: String? = null
        var date: Long = 0
        var publishTime: Long = 0
        var count: Int = 0
        var itemList: List<ItemListBean>? = null

        class ItemListBean {
            /**
             * type : banner2
             * data : {"dataType":"Banner","id":0,"title":"","description":"","image":"http://img.kaiyanapp.com/eef24aa10ab6cf17b5a512943ec22053.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"","adTrack":null,"shade":false,"label":null,"labelList":null,"header":null}
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
                /**
                 * dataType : Banner
                 * id : 0
                 * title :
                 * description :
                 * image : http://img.kaiyanapp.com/eef24aa10ab6cf17b5a512943ec22053.jpeg?imageMogr2/quality/60/format/jpg
                 * actionUrl :
                 * adTrack : null
                 * shade : false
                 * label : null
                 * labelList : null
                 * header : null
                 */

                var dataType: String? = null
                var id: Int = 0
                var title: String? = null
                var description: String? = null
                var image: String? = null
                var actionUrl: String? = null
                var adTrack: Any? = null
                var isShade: Boolean = false
                var label: Any? = null
                var labelList: Any? = null
                var header: Any? = null
                var playUrl:String? = null
                var cover:CoverBean? = null

                class CoverBean{
                    var blurred : String? = null
                    var detail: String? = null
                    var feed : String? = null
                    var homepage : String? = null
                }
            }
        }
    }
}
