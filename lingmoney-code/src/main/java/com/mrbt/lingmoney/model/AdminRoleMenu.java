package com.mrbt.lingmoney.model;

import java.io.Serializable;

public class AdminRoleMenu implements Serializable {
    /**
     * 主键
     * 表字段 : admin_role_menu.id
     */
    private Integer id;

    /**
     * 菜单id
     * 表字段 : admin_role_menu.menu_id
     */
    private Integer menuId;

    /**
     * 权限id
     * 表字段 : admin_role_menu.role_id
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_role_menu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:admin_role_menu.id
     *
     * @return admin_role_menu.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:admin_role_menu.id
     *
     * @param id the value for admin_role_menu.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 菜单id 字段:admin_role_menu.menu_id
     *
     * @return admin_role_menu.menu_id, 菜单id
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置 菜单id 字段:admin_role_menu.menu_id
     *
     * @param menuId the value for admin_role_menu.menu_id, 菜单id
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取 权限id 字段:admin_role_menu.role_id
     *
     * @return admin_role_menu.role_id, 权限id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置 权限id 字段:admin_role_menu.role_id
     *
     * @param roleId the value for admin_role_menu.role_id, 权限id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * ,admin_role_menu
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", menuId=").append(menuId);
        sb.append(", roleId=").append(roleId);
        sb.append("]");
        return sb.toString();
    }
}