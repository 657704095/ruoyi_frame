import request from '@/utils/request'

// 查询系统协议列表
export function listLongtext(query) {
  return request({
    url: '/system/longtext/list',
    method: 'get',
    params: query
  })
}

// 查询系统协议详细
export function getLongtext(id) {
  return request({
    url: '/system/longtext/' + id,
    method: 'get'
  })
}

// 新增系统协议
export function addLongtext(data) {
  return request({
    url: '/system/longtext',
    method: 'post',
    data: data
  })
}

// 修改系统协议
export function updateLongtext(data) {
  return request({
    url: '/system/longtext',
    method: 'put',
    data: data
  })
}

// 删除系统协议
export function delLongtext(id) {
  return request({
    url: '/system/longtext/' + id,
    method: 'delete'
  })
}

// 导出系统协议
export function exportLongtext(query) {
  return request({
    url: '/system/longtext/export',
    method: 'get',
    params: query
  })
}