package org.offer.shortlink.project.controller;

import lombok.RequiredArgsConstructor;
import org.offer.shortlink.project.common.convention.result.Result;
import org.offer.shortlink.project.common.convention.result.Results;
import org.offer.shortlink.project.dto.req.RecycleBinSaveReqDTO;
import org.offer.shortlink.project.service.RecycleBinService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 回收站管理控制层
 */
@RestController
@RequiredArgsConstructor
public class RecycleBinController {

    private final RecycleBinService recycleBinService;

    /**
     * 保存回收站
     */
    @PostMapping("/api/short-link/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody RecycleBinSaveReqDTO requestParam) {
        recycleBinService.saveRecycleBin(requestParam);
        return Results.success();
    }
}
