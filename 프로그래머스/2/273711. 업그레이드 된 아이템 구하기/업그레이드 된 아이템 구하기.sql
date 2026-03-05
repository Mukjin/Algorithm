SELECT item_id, item_name, rarity
FROM item_info
WHERE item_id IN (SELECT t.item_id
                  FROM item_info i
                           JOIN item_tree t
                                ON i.item_id = t.parent_item_id
                  WHERE rarity = 'RARE')
ORDER BY item_id DESC