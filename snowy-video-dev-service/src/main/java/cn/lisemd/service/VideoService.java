package cn.lisemd.service;

import cn.lisemd.pojo.Comments;
import cn.lisemd.pojo.UsersInfo;
import cn.lisemd.pojo.Videos;
import cn.lisemd.pojo.vo.CommentsVO;
import cn.lisemd.pojo.vo.VideosVO;
import cn.lisemd.utils.PagedResult;

import java.util.List;


public interface VideoService {


    /**
     * 保存视频
     *
     * @return
     */
    String saveVideo(Videos video);


    /**
     * 修改视频封面
     *
     * @return
     */
    void updateVideo(String videoId, String coverPath);

    /**
     * 获取全部视频
     *
     * @return
     */
    List<VideosVO> getAllVideos();

    /**
     * 分页查询视频列表
     *
     * @param page
     * @param pageSize
     * @return
     */
    PagedResult getVideos(Videos video, Integer isSaveRecord, Integer page, Integer pageSize);

    /**
     * 获取热搜词列表
     * @return
     */
    List<String> getHotwords();


    /**
     *  点赞
     */
    void userLikeVideo(String userId,String videoId,String videoCreaterId);


    /**
     *  取消点赞
     */
    void userUnlikeVideo(String userId,String videoId,String videoCreaterId);


    /**
     *  查找点赞的视频
     */
    List<VideosVO> queryUserLike(String userId);


    /**
     * 分页查询关注用户的视频列表
     */
    List<VideosVO> queryMyFollowVideos(String userId);


    /**
     * 用户留言
     */
    void saveComment(Comments comment);

    /**
     * 获取视频用户留言
     */
    List<CommentsVO> getVideoComments(String videoId);

    /**
     * 获取全部视频留言
     */
    List<CommentsVO> getAllComments(String userId);
}
