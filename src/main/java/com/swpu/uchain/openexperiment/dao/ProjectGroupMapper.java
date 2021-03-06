package com.swpu.uchain.openexperiment.dao;

import com.swpu.uchain.openexperiment.VO.project.CheckProjectVO;
import com.swpu.uchain.openexperiment.VO.project.SelectProjectVO;
import com.swpu.uchain.openexperiment.domain.ProjectGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectGroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProjectGroup record);

    ProjectGroup selectByPrimaryKey(Long id);

    List<ProjectGroup> selectAll();

    int updateByPrimaryKey(ProjectGroup record);

    ProjectGroup selectByName(String projectName);

    List<ProjectGroup> selectByUserIdAndStatus(Long userId, Integer projectStatus);

    List<CheckProjectVO> selectApplyOrderByTime(int projectStatus);

    List<SelectProjectVO> selectByFuzzyName(@Param("name") String name);
}