import os

patches = []
for root, dirs, files in os.walk(r'C:\GitHub\Silkard-26.1\nms-patches'):
    for f in files:
        if f.endswith('.patch'):
            path = os.path.join(root, f)
            size = os.path.getsize(path)
            if size <= 1024:
                patches.append((path, size))

patches.sort(key=lambda x: x[0])
with open(r'C:\GitHub\Silkard-26.1\patches_1kb.txt', 'w') as out:
    for p, s in patches:
        out.write(f'{p}|{s}\n')

mixins = []
for root, dirs, files in os.walk(r'C:\GitHub\Silkard-26.1\projects\silkard\src\main\java\com\mohistmc\silkard\mixin'):
    for f in files:
        if f.startswith('Mixin') and f.endswith('.java'):
            mixins.append(os.path.join(root, f))

mixins.sort()
with open(r'C:\GitHub\Silkard-26.1\existing_mixins.txt', 'w') as out:
    for m in mixins:
        out.write(m + '\n')

print(f'Patches <=1KB: {len(patches)}')
print(f'Existing mixins: {len(mixins)}')
