package com.blueskykong.tm.server.service;


import com.blueskykong.tm.common.entity.TxManagerServer;
import com.blueskykong.tm.common.entity.TxManagerServiceDTO;
import com.blueskykong.tm.server.entity.TxManagerInfo;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * @author keets
 */
public interface TxManagerInfoService {

    /**
     * 业务端获取TxManager信息
     *
     * @return TxManagerServer
     */
    TxManagerServer findTxManagerServer();

    /**
     * 服务端信息
     *
     * @return TxManagerInfo
     */
    List<TxManagerInfo> findTxManagerInfo();

    /**
     * 获取eureka上的注册服务
     *
     * @return List<TxManagerServiceDTO>
     */
    List<TxManagerServiceDTO> loadTxManagerService();


    /**
     * 按照日期获取tx的数量
     *
     * @param timestamp
     * @param limit
     * @return Map
     */
    Map<String, String> txCountByDate(Timestamp timestamp, int limit);

    /**
     * 按照日期获取tx的数量
     *
     * @return Map
     */
    Map<String, String> clientDetails(Boolean source);
}
